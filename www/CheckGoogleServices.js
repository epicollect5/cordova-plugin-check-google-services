var exec = require('cordova/exec');
var CLASS = 'CheckGoogleServices';

module.exports = {
    checkGoogleServicesAvailability: function (onSuccess, onError) {
        exec(onSuccess, onError, CLASS, 'checkGoogleServicesAvailability', []);
    }
}
