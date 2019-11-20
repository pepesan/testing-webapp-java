describe("A suite with some shared setup", function() {
    var foo = 0;

    beforeEach(function() {
        foo += 1;
    });

    afterEach(function() {
        foo = 0;
    });

    beforeAll(function() {
        foo = 1;
    });


    afterAll(function() {
        foo = 0;
    });
    it('debería ser true', function() {
        expect(true).toBe(true);
    });
    it('debería ser false', function() {
        expect(false).toBe(false);
    });

});