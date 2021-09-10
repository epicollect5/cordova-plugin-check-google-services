Cordova Check Huawei Services Availability
=======================================

Use this plugin to check if an android device has the `Huawei Services` available. It would be helpful if you want to check if the device is a Huawei without `Google Services`.


## Install

```
cordova plugin add https://github.com/pawfrolow/cordova-plugin-check-huawei-services-google-priority
```
or
```
cordova plugin add cordova-plugin-check-huawei-services-google-priority
```

## Usage in Javascript

```
// available => iOS + Android

CheckHuaweiServices.checkHuaweiServicesAvailability(successCallback, failureCallback)
```

- `successCallback({ status: boolean})` status will be `true` if the device is a Huawei device without Google Services.
- `failureCallback(error:string)` is called if there was an error checking if the device has or not Google Services.
