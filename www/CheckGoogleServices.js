var exec = require('cordova/exec');
var CLASS = 'checkGoogleServices';

module.exports = {
    checkGoogleServicesAvailability: function (onSuccess, onError) {
        exec(onSuccess, onError, CLASS, 'checkGoogleServicesAvailability', []);
    }
}
