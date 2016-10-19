require 'intercom'

# enter your configuration here
APP_ID = nil
API_KEY = nil
TOKEN = nil # if specified, till take precedence over APP_ID/API_KEY
# end of configuration

if !TOKEN.nil? && !TOKEN.empty? then
	intercom = Intercom::Client.new(token: TOKEN)
else
	intercom = Intercom::Client.new(app_id: APP_ID, api_key: API_KEY)
end

puts "Total number of users: #{intercom.counts.for_type(type: 'user').user["user"]}"
puts "First User (if any): \n";
intercom.users.find_all(type: 'users', page: 1, per_page: 1, order: :asc).each_with_index {|user, i| puts user.inspect}