// Calculator.spec.js
describe('Calculator', function() {

    it('should have a storeAction function', function() {
        expect(Calculator.storeAction).toBeDefined();
    });

    describe('storeAction', function() {

        beforeEach(function() {
            Calculator.storeAction('RESET');
        });

        it('should return the last result for unkown actions', function() {
            expect(Calculator.storeAction('HI')).toEqual(0);
            Calculator.storeAction('1');
            expect(Calculator.storeAction('HI')).toEqual(1);
        });

        it('should add numbers', function(){
            Calculator.storeAction('1');
            Calculator.storeAction('ADD');
            Calculator.storeAction('1');
            expect(Calculator.storeAction('RESULT')).toEqual(2);
        });

        it('should multiply numbers', function() {
            Calculator.storeAction('2');
            Calculator.storeAction('MULTIPLY');
            Calculator.storeAction('4');
            expect(Calculator.storeAction('RESULT')).toEqual(8);
        });

    });

});