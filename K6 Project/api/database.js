const Database = require('better-sqlite3');

const db = new Database('app.db');

// Create users table
db.exec(`
    CREATE TABLE IF NOT EXISTS users (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        username TEXT UNIQUE NOT NULL,
        password TEXT NOT NULL,
        status TEXT DEFAULT 'active'
    )
`);

console.log('SQLite database connected successfully');

module.exports = db;