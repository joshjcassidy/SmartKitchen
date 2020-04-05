//Setting path of the proto file
var PROTO_PATH = "../../../../../resources/lights.proto";

//Requiring use of grpc for server
var grpc = require('grpc');
var protoLoader = require('@grpc/proto-loader');

var packageDef = protoLoader.loadSync(PROTO_PATH, { keepCase: true, longs: String, enums: String, defaults: true, oneofs: true});

var lights_proto = grpc.loadPackageDefinition(packageDef);

//Returns message informing client that lights are turned on when called
function lightsOn(call, callback){
	callback(null, {message: `Lights turned on.`});
}

//Returns message informing client that lights are turned off when called
function lightsOff(call, callback){
	callback(null, {message: `Lights turned off.`});
}

function startServer(){
	var server = new grpc.Server();
	server.addService(lights_proto.Lights.service, {
		lightsOn: lightsOn
	});

	server.addService(lights_proto.Lights.service, {
		lightsOff: lightsOff
	});

	server.bind('localhost:8004', grpc.ServerCredentials.createInsecure());
}

startServer();