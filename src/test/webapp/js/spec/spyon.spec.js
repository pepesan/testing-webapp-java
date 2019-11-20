var Person = function() {
    //defaults
    var _age  =  0,
        _name = 'John Doe';

    this.initialize = function(name, age) {
        _name = name || _name;
        _age  = age  || _age;
    };
    if (arguments.length) this.initialize();

    //getters and setters
    this.getName     = function()      { return _name; };
    this.setName     = function (name) { _name = name; };

    //public methods
    this.addBirthday = function()      { _age++; };
    this.toString    = function()      { return 'My name is " + this.getName() + " and I am " + _age + " years old.'; };
};
describe("Person toString() Test", function() {
    it("calls the getName() function", function() {
        var testPerson = new Person();
        spyOn(testPerson, "getName");
        testPerson.toString();
        expect(testPerson.getName).not.toHaveBeenCalled();
    });
});