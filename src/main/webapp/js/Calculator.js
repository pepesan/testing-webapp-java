var Calculator = (function(){
    'strict mode';

    var store = '',

        lastResult = 0,

        setLastResult = function(num) {

            lastResult = parseFloat(num);

        },

        exports = {

            isNumeric: function(n) {

                return !isNaN(parseFloat(n)) && isFinite(n);

            },

            storeAction: function(action) {

                if(exports.isNumeric(action) && !exports.isNumeric(store)) {

                    var num = parseFloat(action);
                    switch(store) {
                        case 'ADD':
                            setLastResult(lastResult + num);
                            break;

                        case 'MULTIPLY':
                            setLastResult(lastResult * num);
                            break;

                        default:
                            store = action;
                            setLastResult(action);
                            break;
                    }

                    store = '';

                } else { // new operation

                    store = action;

                    if(exports.isNumeric(action)) {

                        setLastResult(action);

                    } else if(action == 'RESET') {

                        setLastResult(0);

                    }

                }

                return lastResult;
            }

        };

    return exports;

})();