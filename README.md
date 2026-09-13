[README.md](https://github.com/user-attachments/files/32164802/README.md)
**\# Builder Pattern - Computer**



**\## Project Description**



This project demonstrates the Builder creational design pattern in Java.



The application builds different types of computers step by step.

The same construction process can produce different computer configurations.



**The project includes two concrete builders:**



\- GamingComputerBuilder

\- OfficeComputerBuilder



**Each builder creates a Computer with different specifications.**



\## Project Structure



```text

Sulukhan\_A\_SE-2529/

├── src/

│   ├── Computer.java

│   ├── ComputerBuilder.java

│   ├── ComputerDirector.java

│   ├── GamingComputerBuilder.java

│   ├── OfficeComputerBuilder.java

│   └── Main.java

├── .gitignore

└── README.md

```

Design Pattern Structure

**Product**



Computer represents the complex object being built.



**Builder**



ComputerBuilder is an interface that declares the construction steps.



**Concrete Builders**

GamingComputerBuilder creates a gaming computer.

OfficeComputerBuilder creates an office computer.

**Director**



ComputerDirector defines reusable construction sequences for different computer configurations.



**Client**



Main demonstrates how the builders are used and displays the resulting products.



**Example**



The gaming computer is built with:



CPU: Intel i9

RAM: 32 GB

Storage: 1TB SSD

GPU: RTX 4070

Operating System: Windows 11



The office computer is built with:



CPU: Intel i3

RAM: 8 GB

Storage: 512GB SSD

GPU: Integrated Graphics

Operating System: Windows 11

**Why Builder Pattern?**



The Builder pattern separates the construction of a complex object from its representation.



It makes the construction process easier to read and allows different builders to create different configurations of the same product.

In this project, the same Computer product can be built as either a gaming computer or an office computer.



**UML DIAGRAM**

The UML diagram illustrates the implementation of the Builder design pattern in the Computer project. The Computer class is the Product, while ComputerBuilder defines the construction steps. GamingComputerBuilder and OfficeComputerBuilder implement the Builder interface and create different computer configurations. ComputerDirector organizes reusable construction sequences, and Main acts as the Client that initiates the building process.





