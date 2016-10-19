# Using the Intercom API with PHP 

## General PHP information

### Have a PHP version manager
- Examples:
   - https://github.com/wilmoore/php-version

### Using php-version
- Install a version: `brew install php56`
- See all installed versions: `php-version`
- Switch to a version: `php-version 5.6.26`
- Verify switch has taken place `php -v` (you should see the PHP version that you specified)

### Installing packages
- https://getcomposer.org/
- Restore packages: `php composer.phar install` (will install dependencies from `package.json`)
- Manually installing: `php composer.phar require package-name`
- Install and save to `package.json`: `npm install --save dependancy-name`
- Install development dependancy and save to `package.json`: `npm install --save-dev dependancy-name`


## Test intercom-php

### Installation

- Follow latest details as per https://github.com/intercom/intercom-php
- Currently: `php composer.phar require intercom/intercom-php`


### Running 
- Modify `test-intercom-php.php` to insert your API keys / access tokens 
- Running the code: `php test-intercom-php.php`