package org.example.controllers;


import io.swagger.annotations.Api;
import org.example.models.DeliveryEmployee;
import org.example.models.DeliveryEmployeeRequest;
import org.example.services.DeliveryEmployeeService;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Api("deliveryemployeecontroller")
@Path("/api/deliveryemployees/")
public class DeliveryEmployeeController {
    DeliveryEmployeeService deliveryEmployeeService;

    public DeliveryEmployeeController(DeliveryEmployeeService deliveryEmployeeService) { this.deliveryEmployeeService = deliveryEmployeeService; }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDeliveryEmployees() throws SQLException {
        return Response.ok().entity(deliveryEmployeeService.getAllDeliveryEmployees()).build();
    }

    //    @GET
//    @Path("id/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response getEmployeeById(@PathParam("id") int id) throws SQLException {
//        return Response.ok().entity(deliveryEmployeeService.getAllDeliveryEmployees()).build();
//    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response createDeliveryEmployee(
            DeliveryEmployeeRequest deliveryEmployeeRequest) {
        try {
            return Response
                    .status(Response.Status.CREATED)
                    .entity(deliveryEmployeeService.createDeliveryEmployee(deliveryEmployeeRequest))
                    .build();
        } catch (SQLException e) {
            return Response.serverError().build();
        }
    }
}
