const express = require('express');
const db = require('./database');

const app = express();

app.use(express.json());


// ==============================
// Test Users
// ==============================




// ==============================
// Products
// ==============================

const products = [
    {
        id: 1,
        name: 'Laptop',
        price: 999
    },
    {
        id: 2,
        name: 'Mobile Phone',
        price: 599
    },
    {
        id: 3,
        name: 'Keyboard',
        price: 49
    },
    {
        id: 4,
        name: 'Mouse',
        price: 29
    }
];


// ==============================
// Home API
// ==============================

app.get('/', (req, res) => {

    res.status(200).json({
        message: 'Welcome to My K6 API',
        status: 'API is running'
    });

});


// ==============================
// Health Check
// ==============================

app.get('/health', (req, res) => {

    res.status(200).json({
        status: 'UP',
        message: 'API is healthy'
    });

});


// ==============================
// Login API
// ==============================

// ==============================
// Login API
// ==============================

app.post('/auth/login', (req, res) => {

    const { username, password } = req.body;

    // Find user in SQLite database
    const user = db.prepare(`
        SELECT * FROM users
        WHERE username = ? AND password = ?
    `).get(username, password);

    // Invalid username/password
    if (!user) {

        return res.status(401).json({
            message: 'Invalid username or password'
        });

    }

    // Check if user is locked
    if (user.status === 'locked') {

        return res.status(403).json({
            message: 'User is locked out'
        });

    }

    // Successful login
    return res.status(200).json({

        message: 'Login successful',

        username: user.username,

        token: 'dummy-token-123'

    });

});

// ==============================
// Get All Users
// ==============================

// ==============================
// Get All Users
// ==============================

app.get('/users', (req, res) => {

    const users = db.prepare(`
        SELECT username FROM users
    `).all();

    res.status(200).json(users);

});


// ==============================
// Get User By Username
// ==============================

app.get('/users/:username', (req, res) => {

    const username = req.params.username;

    const user = db.prepare(`
        SELECT username FROM users
        WHERE username = ?
    `).get(username);

    if (!user) {

        return res.status(404).json({
            message: 'User not found'
        });

    }

    res.status(200).json(user);

});

// ==============================
// Get All Products
// ==============================

app.get('/products', (req, res) => {

    res.status(200).json(products);

});


// ==============================
// Get Product By ID
// ==============================

app.get('/products/:id', (req, res) => {

    const id = Number(req.params.id);

    const product = products.find(
        p => p.id === id
    );

    if (!product) {

        return res.status(404).json({
            message: 'Product not found'
        });

    }

    res.status(200).json(product);

});


// ==============================
// Create Product
// ==============================

app.post('/products', (req, res) => {

    const { name, price } = req.body;

    if (!name || !price) {

        return res.status(400).json({
            message: 'Name and price are required'
        });

    }

    const newProduct = {

        id: products.length + 1,

        name: name,

        price: price

    };

    products.push(newProduct);

    res.status(201).json({

        message: 'Product created successfully',

        product: newProduct

    });

});


// ==============================
// Start Server
// ==============================

app.listen(3000, () => {

    console.log('Server running on port 3000');

});