# Using the Intercom API with Elixir

## Disclaimer
- I'm not familiar with Elixir so these instructions may not even be best practise but it allows testing of library

## General Elixir Information

### Install
- Via http://elixir-lang.org/install.html
   - OSX: `brew install elixir`

### Creating a project 
- `mix new module_directory_name --module ModuleName`

### Dependencies
- Controlled in `mix.exs` file `defp deps do`... `end` section
   - via central repo: `{:intercom, "~> 0.0.0"}` 
   - via Git: `{:intercom, git: "https://github.com/intercom/intercom-elixir"}`
- Download updates `mix deps.get`
- Specify depedency to run in application in `def application do` ... `end` section `[applications: [:logger, :intercom]]`

### Run project
- `mix compile`

## Test intercom-elixir

### Installation
- Follow latest details as per https://github.com/intercom/intercom-elixir
- Currently:
    - `{:intercom, "~> 0.0.0"}` / `{:intercom, git: "https://github.com/intercom/intercom-elixir"}`

### Running 
- Modify `/testing_intercom_elixir/lib/testing_intercom_elixir.ex` to insert your API keys / access tokens 
- Run: `mix compile`