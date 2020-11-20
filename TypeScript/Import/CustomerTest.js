"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
var Customer_1 = require("../Export/Customer");
var CustomerTest = /** @class */ (function (_super) {
    __extends(CustomerTest, _super);
    function CustomerTest(id, name) {
        return _super.call(this, id, name) || this;
    }
    return CustomerTest;
}(Customer_1.Customer));
var Jayant = new CustomerTest(101, "Jayant");
console.log("Initialize From Constructor::");
console.log(Jayant.Id);
console.log(Jayant.Name);
Jayant.Id = 105;
Jayant.Name = "Jay";
console.log("Assigning From Setter::");
console.log(Jayant.Id);
console.log(Jayant.Name);
