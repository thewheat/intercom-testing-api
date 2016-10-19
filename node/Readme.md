# Using the Intercom API with Node 

## General Node Information

### Have a Node version manager
- Examples:
   - https://github.com/creationix/nvm

### Using nvm
- List installable versions: `nvm ls-remote`
- Install a version: `nvm install v5.12.0`
- See all installed versions: `nvm ls`
- Switch to a version: `nvm use v5.12.0`
- Verify switch has taken place `node -v` (you should see the Node version that you specified)


### Installing packages
- Restore packages: `npm install` (will install dependencies from `package.json`)
- Manually installing: `npm install dependancy-name`
- Install and save to `package.json`: `npm install --save dependancy-name`
- Install development dependancy and save to `package.json`: `npm install --save-dev dependancy-name`



## Test intercom-node

### Installation
- Follow latest details as per https://github.com/intercom/intercom-node
- Currently: `npm install intercom-client`

### Running 
- Modify `test-intercom-node.js` to insert your API keys / access tokens 
- Running the code: `node test-intercom-node.js`