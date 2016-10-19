# Using the Intercom API with Ruby 

## General Ruby Information

### Have a Ruby version manager
- Examples:
   - https://github.com/rvm/rvm
   - https://github.com/rbenv/rbenv


### Using rbenv
- List installable versions: `rbenv install -l`
- Install a version: `rbenv install 2.3.1`
- See all installed versions: `rbenv versions`
- Switch to a version: 
   - Local directory: `rbenv local 2.3.1`
   - Globally: `rbenv global 2.3.1`
- Verify switch has taken place `ruby -v` (you should see the ruby version that you specified)

#### Setting default ruby version
- Create a `.ruby-version` file with the version


### Installing packages
- https://github.com/bundler/bundler
- Switch to approriate Ruby version
- Install bundler: `gem install bundler`
- Restore packages: `bundle install` (will install dependencies from `Gemfile`)


### Saving gems to the Gemfile
- https://github.com/DruRly/gemrat
   - Install
      - Manually: `gem install gemrat`
      - Via `Gemfile`
         - Add to `Gemfile`: `gem 'gemrat'`
         - Install: `bundle install`
   - Usage
      - Add a gem via gemrat: `gemrat gem_name`
- Or manually edit `Gemfile`


## Test intercom-ruby

### Installation

- Follow latest details as per https://github.com/intercom/intercom-ruby
- Currently: `gem install intercom`


### Running 
- Modify `test-intercom-ruby.rb` to insert your API keys / access tokens 
- Running the code: `ruby test-intercom-ruby.rb`