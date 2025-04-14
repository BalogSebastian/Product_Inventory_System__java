Task Overview

You’re going to build a program simulating a Product Inventory System for an online store. This system will read product data from a file, process it into a structured format (with matrices, lists, maps, and more), and then allow for complex querying and filtering. The system will involve abstract methods, interfaces, and the use of various data structures to maximize efficiency.

Project Breakdown
1. Reading Data from a File
You will have a file with product data that contains information such as product name, price, category, and availability.

You'll read the file, parse the data, and store it in the system.

2. Data Structures
List of Products: Store all products in a List<Product>.

Map for Categories: Use a Map<String, List<Product>> to categorize products by type (e.g., electronics, clothing).

HashMap for Pricing: Use a HashMap<String, Double> to store prices of products for fast look-up.

3. Filtering and Searching
Use Java Streams to filter products by price, category, or availability.

Implement various query methods like finding products within a price range, products in a specific category, and so on.

4. Matrix Structure
Store products in a 2D matrix representing availability in different warehouses, with each cell representing the quantity available in a warehouse for a specific product.

5. Interfaces and Abstract Methods
Create an interface ProductSearchable for different types of searches.

Implement an abstract class ProductFilter that defines common filtering functionality.

