class Person {
  constructor(firstName, lastName) {
    this.firstName = firstName;
    this.lastName = lastName;

    return {
      getFirstName: function () {
        return firstName;
      },
      getLastName: function () {
        return lastName;
      }
    };
  }
}

class Employee {
  constructor(id, Dept, person) {
    this.id = id;
    this.Dept = Dept;
    this.person = person;

    return {
      getid: function () {
        return id;
      },
      getDept: function () {
        return Dept;
      },
      fullEmployeeDetails: function () {
        console.log(person.getFirstName());
        console.log(person.getLastName());
        console.log(this.getid());
        console.log(this.getDept());
      }
    };
  }
}

var person = new Person("John", "Doe");
var employee = new Employee(1,"CSE",person);
console.log(employee);
employee.fullEmployeeDetails();