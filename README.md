# Student Form Automation Test

A Selenium WebDriver automation project that demonstrates form automation on TutorialsPoint's practice page.

## Overview

This project automates filling and submitting a student practice form with various input types including:
- Text fields (name, email, mobile)
- Radio buttons (gender)
- Date picker
- Subject input
- Checkboxes (hobbies)
- File upload
- Textarea (address)
- Dropdown selections (state, city)

## Prerequisites

- Java JDK 8 or higher
- Maven
- Chrome browser
- IntelliJ IDEA (recommended)

## Project Structure
StudentForm
├── src
│   └── test
│       └── java
│           └── com
│               └── java
│                   └── studentformtest
│                       └── PracticeFormAutomation.java
├── pom.xml
└── README.md


## Setup

1. Clone the repository
2. Place your profile image at `D:\Java\StudentForm\Profile.jpg`
3. Install dependencies:
``bash
mvn clean install

Running the Test
Execute via Maven:
mvn test

Or run directly from IntelliJ IDEA by running the PracticeFormAutomationTest class.

Test Flow
Opens Chrome browser and navigates to the practice form
Fills in personal information
Selects gender
Enters mobile number and date of birth
Adds subject and selects hobbies
Uploads profile picture
Enters address
Selects state and city
Submits the form
Verifies successful submission
Closes the browser

Dependencies
Selenium WebDriver
WebDriverManager
TestNG (for assertions)

Notes
The test uses Thread.sleep() for demonstration. In production, use explicit/implicit waits
Update the file path for Profile.jpg according to your system
The form URL is hardcoded to TutorialsPoint's practice page
