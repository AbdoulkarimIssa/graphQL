from gql import gql, Client
from gql.transport.requests import RequestsHTTPTransport

# Set up the transport to the GraphQL API
transport = RequestsHTTPTransport(url='http://localhost:8080/graphql')
client = Client(transport=transport)

# Define your GraphQL query
query = gql('''
    query {
        Players(count: 10, offset: 0) {
            id
            firstName
            lastName
            equipeId
        }
        allTeams {
            id
            name
            colors
        }
    }
''')

# Execute the query
result = client.execute(query)

# Print the result
print(result)

# Uncomment the following code to perform a mutation

mutation = gql('''
mutation {
        writePlayer(id: "100", firstName: "issa", LastName: "karim", equipeId: 1) {
            id
            firstName
            lastName
            equipeId
        }
        writeTeam(id: "100", name: "test", colors: "jaune") {
            id
            name
            colors
        }
    }
''')

result = client.execute(mutation)
print(result)
