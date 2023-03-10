# Project Description

This project is an online bakery web application that allows customer to check for different bakery items available at the online shop and then purchase online. This project provides a list of different bakery products displayed online in various categories section. The customer may browse through these items. If the customer wishes to purchase any product(s), he/she may add it to the shopping cart available. Making sure all the features of an e-commerce web application, this online bakery web application (Baked with Love) acts as a central database containing various bakery products. It provides customers online shopping facilities from their homes.

## Installation Guide

1. Clone the repository 'https://github.com/Akansh-Verma/BakedWithLove.git'
2. Navigate to the project directory: 'cd src/main/java'
3. Run the application 'mvn spring-boot:run' or if you are running the application in VSCode you can directly run the application by running MinorApplication.java file

## Usage

1. Navigate to 'http://localhost:8080' in your web browser
2. You can visit different sections such as Home, Shop, Admin, Login/Logout, Cart, Order.
3. Browse the available products and add them to your cart
4. Click on the cart icon to view your order summary
5. Proceed to checkout and make payment using a card\*.

## Contributing

Contributions are always welcome! Please follow the guidelines below:

1. Fork the repository: 'https://github.com/Akansh-Verma/BakedWithLove.git'
2. Create a new branch: git checkout -b feature/your-feature-name
3. Make your changes and commit them: git commit -am 'Add your commit message here'
4. Push your changes to the branch: git push origin feature/your-feature-name
5. Submit a pull request

## Project Structure

baked with love/

├── src\
│ ├── main\
│ │ ├── java\
│ │ │ ├── com.bakedwithlove.minor\
│ │ │ │ ├── controller\
│ │ │ │ ├── model\
│ │ │ │ ├── repository\
│ │ │ │ ├── service\
│ │ │ │ ├── configuration\
│ │ │ │ ├── dto\
│ │ │ │ ├── global\
│ │ │ │ ├── MinorApplication.java\
│ │ │ ├── resources\
│ │ │ │ ├── static\
│ │ │ │ ├── templates\
│ │ │ │ ├── application.properties\
├── pom.xml\
└── README.md

## Contact Information

If you have any questions or concerns, please contact us at [Website](https://akanshverma.netlify.app/).

## Acknowledgments

We would like to thank the following open-source libraries for their contributions:

- Spring Boot
- Thymeleaf
- Hibernate
- Docker

## Sections

### User Section

#### Home Page

#### Shop Page

#### Cart Page

#### Login Page

### Admin Section
