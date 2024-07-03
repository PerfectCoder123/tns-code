package com.jahid.assignment.assignment10;

//FormValidator class to validate the form data
class FormValidator {
 public void validate(Form form) throws InvalidFormException {
     if (form.getName() == null || form.getName().isEmpty()) {
         throw new InvalidFormException("Name cannot be empty.");
     }
     if (form.getEmail() == null || !form.getEmail().contains("@")) {
         throw new InvalidFormException("Invalid email address.");
     }
     if (form.getAge() < 18 || form.getAge() > 100) {
         throw new InvalidFormException("Age must be between 18 and 100.");
     }
 }
}