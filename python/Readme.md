# Using the Intercom API with Python 

## Have a Python version manager
- Examples:
   - https://github.com/yyuu/pyenv

## Using pyenv
- List installable versions: `pyenv install -l`
- Install a version: `pyenv install 3.5.2`
- See all installed versions: `pyenv versions`
- Switch to a version: 
   - Local directory: `pyenv local 3.5.2`
   - Globally: `pyenv global 3.5.2`
- Verify switch has taken place `python --version` (you should see the Python version that you specified)

### Setting default Python version
- Create a `.python-version` file with the version


## Installing packages
- Create an environment for packages to live in (to prevent conflicts with other python projects)
   - https://virtualenv.pypa.io/
   - Install `pip install virtualenv`
   - Create an environment: `virtualenv ENV`
   - Activate environment: `source ENV/bin/activate`
      - Run all commands in this environment. Deactivate when done  
   - Deactivate enviornment: `deactivate`
- Restore packages (from a `requirements.txt`): `pip install -r requirements.txt`
- Install package: `pip install package-name`
- Save packages to `requirements.txt`: `pip freeze > requirements.txt`
