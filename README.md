# Project Overview

This repository contains three systems implemented in Java with help of OOP:

1. *Site Construction System*:  manage aspects of a construction site,equipment tracking, project monitoring.
2. * Hotel Management System*:  manage guest check-in and check-out, room booking, billing, and room availability.
3. *Traffic Fine Management System*:  It allows the Police to register drivers, issue fines, view fine records, and generate reports.

## Prerequisites

- Java Development Kit (JDK) 11 or later
- Docker installed on your system

## Setup Instructions


### Option 1: Build and Run Locally

1. *Build the Docker Image*:

   bash
   docker build -t 26631-masengesho-emima-java .
   

2. *Run the Docker Container*:

   bash
   docker run -it 26631-masengesho-emima-java
   

3. *Navigate and Execute*:
   Inside the container, navigate to the desired system folder and compile/run the Java files. For example:

   bash
   cd site-construction-system
   javac Main.java
   java Main
   

#### Option 2: Use Docker Registry

1. *Pull the Prebuilt Docker Image*:

   bash
   docker pull 26631-masengesho-emima-java
   

2. *Run the Docker Container*:

   bash
   docker run -it 26631-masengesho-emima-java
   

3. *Navigate and Execute*:
   Inside the container, navigate to the desired system folder and compile/run the Java files. For example:

   bash
   cd site-constraction-system
   javac Main.java
   java Main
   

### Running Locally

1. Clone the repository:

   bash
   git clone https://github.com/emima749/Masengesho-Emima.git
   

2. Navigate to the desired system folder and compile/run the Java files. For example:

   bash
   cd site-constraction-system
   javac Main.java
   java Main
   