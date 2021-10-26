class Account {

  constructor(name, document, email, password) {
      this.id;
      this.name = name;
      this.document = document;
      this.email = email;
      this.password = password;
  }

  printDataAccount() {
      console.log("The name: " + this.name);
      console.log("The document: " + this.document);
      console.log("The email: " + this.email);
      console.log("The password: " + this.password);
  }

}