-- Create Database if not exists
CREATE DATABASE IF NOT EXISTS fwrp0;
USE fwrp0;

-- Create Users Table
CREATE TABLE IF NOT EXISTS Users (
    id INT AUTO_INCREMENT,
    username VARCHAR(100),
    password VARCHAR(100),
    userType ENUM('Retailer', 'Consumer', 'Charitable Consumer'),
    PRIMARY KEY(id)
) ENGINE=InnoDB;

-- Create Product Table
CREATE TABLE IF NOT EXISTS Product (
    product_id INT AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(255),
    category VARCHAR(255),
    description TEXT,
    seller_price DECIMAL(10, 2),
    added_date DATE,
    Food_condition VARCHAR(50), -- Enclose `condition` in backticks if you use reserved keywords
    user_id INT,
    image_url VARCHAR(255),
    FOREIGN KEY (user_id) REFERENCES Users(id)
) ENGINE=InnoDB;

-- Sample data insertion (optional)
INSERT INTO Users (username, password, userType) VALUES
('john_doe', 'password123', 'Retailer'),
('jane_smith', 'securepass', 'Consumer'),
('charlie_brown', '123456', 'Charitable Consumer');

-- You can add more INSERT statements here to populate your tables with sample data

-- Inserting Organic Apples
INSERT INTO Product (product_name, category, description, seller_price, added_date, Food_condition, user_id, image_url)
VALUES ('Organic Apples', 'Fruits', 'Fresh and organic apples picked from local orchards.', 2.99, '2024-04-10', 'New', 1, 'https://example.com/apple_image.jpg');

-- Inserting Grass-fed Beef Steak
INSERT INTO Product (product_name, category, description, seller_price, added_date, Food_condition, user_id, image_url)
VALUES ('Grass-fed Beef Steak', 'Meat & Poultry', 'Tender and flavorful grass-fed beef steak.', 15.99, '2024-04-09', 'Fresh', 2, 'https://example.com/beef_steak_image.jpg');

-- Inserting Organic Spinach
INSERT INTO Product (product_name, category, description, seller_price, added_date, Food_condition, user_id, image_url)
VALUES ('Organic Spinach', 'Vegetables', 'Fresh organic spinach leaves packed with nutrients.', 3.49, '2024-04-08', 'New', 3, 'https://example.com/spinach_image.jpg');

-- Inserting Wild-caught Salmon Fillet
INSERT INTO Product (product_name, category, description, seller_price, added_date, Food_condition, user_id, image_url)
VALUES ('Wild-caught Salmon Fillet', 'Seafood', 'Premium wild-caught salmon fillet, rich in omega-3.', 12.99, '2024-04-07', 'Fresh', 4, 'https://example.com/salmon_image.jpg');


INSERT INTO Product (product_name, category, description, seller_price, added_date, Food_condition, user_id, image_url)
VALUES ('Organic Apples', 'Fruits', 'Fresh organic apples from local farm.', 0.00, '2024-04-10', 'Fresh', 1, 'images/apples.jpg');

INSERT INTO Product (product_name, category, description, seller_price, added_date, Food_condition, user_id, image_url)
VALUES ('Whole Grain Bread', 'Bakery', 'Whole grain bread, rich in fiber and nutrients.', 0.00, '2024-04-09', 'Fresh', 2, 'images/bread.jpg');

INSERT INTO Product (product_name, category, description, seller_price, added_date, Food_condition, user_id, image_url)
VALUES ('Organic Spinach', 'Vegetables', 'Fresh organic spinach leaves.', 0.00, '2024-04-09', 'Fresh', 3, 'images/spinach.jpg');
