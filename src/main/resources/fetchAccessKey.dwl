%dw 2.0
output application/json
var res = Mule::lookup("sqs-poc-nylFlow", {})
---
res.accessKey