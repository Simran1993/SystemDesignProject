# Food Waste Reduction Platform Documentation

## Table of Contents
1. [Version History](#version-history)
2. [Introduction](#introduction)
3. [Targeted Audience](#targeted-audience)
4. [Scope](#scope)
5. [Application Design Overview](#application-design-overview)
6. [Business Architecture](#business-architecture)
7. [Detailed Design](#detailed-design)
8. [Data Architecture](#data-architecture)
9. [Security Architecture](#security-architecture)
10. [Deployment Architecture](#deployment-architecture)
11. [Testing Model](#testing-model)
12. [References](#references)
13. [Acronyms/Abbreviations](#acronymsabbreviations)

## Version History
- **Version 1.2**
  - **Team Members:**
    - Harsimranjit Singh
    - Krish Patel
    - Arshdeep Kaur

## Introduction
The Food Waste Reduction Platform aims to reduce global food waste by connecting food businesses, consumers, and philanthropic groups. This document provides a comprehensive overview of the platform's architecture, design considerations, and features.

## Targeted Audience
Stakeholders: Development Team, Project Managers, Quality Assurance Team, Clients

## Scope
**In:**
- High-level architecture overview
- Detailed design components
- Database structure and relationships
- Security considerations
- Deployment and testing model

**Out:**
- Low-level code details
- Platform-specific implementation nuances
- RDBMS-specific details

## Application Design Overview
- **Presentation Layer:** Focuses on UI and UX using MVC architecture with technologies like HTML, CSS, JavaScript, and frameworks such as React or Angular.
- **Business Layer:** Encapsulates core functionalities and business logic, employing design patterns like Singleton and Observer.
- **Database Layer:** Manages data storage and retrieval with RDBMS like MySQL or PostgreSQL, utilizing the DAO pattern for modularity.

## Business Architecture
- **Use Case Diagrams:** Visual representations of system interactions and functionalities.
- **User Registration Flow:** Steps for user registration, including personal information submission and user type selection.
- **Retailers Management:** Management of inventory and identification of surplus food items for donation or sale.
- **Charitable Organizations:** Process for claiming food items and updating inventory.
- **Consumers:** Steps for browsing, purchasing, and updating inventories with surplus food items.
- **Bonus Functionality:** Additional features and their use cases.

## Detailed Design
- **Presentation Layer:** Detailed class diagrams for UI components and their interactions.
- **Business Layer:** Class diagrams outlining controllers, services, and data entity models.
- **Database Layer:** Detailed database schema, including tables, columns, and relationships visualized through ERDs.

## Data Architecture
- **FWRP Database Schema:** In-depth overview of the database schema, detailing tables, attributes, and relationships.
- **Relationships and Entities:** Elaboration on entity relationships, cardinalities, and constraints.

## Security Architecture
- **User Authentication and Authorization:** Methods and techniques for managing user access.
- **Data Encryption:** Encryption techniques for protecting sensitive data, including AES and SSL/TLS protocols.

## Deployment Architecture
- **Cloud Deployment:** Details on cloud provider selection, infrastructure setup, and considerations for scalability and fault tolerance.
- **Docker Containerization:** Process for containerizing the application with Docker and orchestration tools like Kubernetes.

## Testing Model
- **JUnit Testing:** Use of JUnit for unit testing, including mocking and stubbing techniques.
- **API Testing Approach:** Methodology for automated API testing, including tools and frameworks for validation and security testing.
- **User Acceptance Testing (UAT):** Approach for conducting UAT to validate system functionality against user requirements.

## References
Citations and sources used during the design process.

## Acronyms/Abbreviations
List of acronyms and abbreviations used in the document.
