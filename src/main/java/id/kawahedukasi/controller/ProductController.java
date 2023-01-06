package id.kawahedukasi.controller;

import id.kawahedukasi.model.Product;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

@Path("/products")
public class ProductController extends Application {
    private final List<Product> products;

    public ProductController() {
        products = new ArrayList<Product>();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createProduct(Product product) {
        products.add(product);
        return Response.status(Response.Status.CREATED).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response getProduct(@PathParam("id") String id) {
        Product product = getProductById(id);
        if (product != null) {
            return Response.ok(product).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response updateProduct(@PathParam("id") String id, Product updatedProduct) {
        Product product = getProductById(id);
        if (product != null) {
            product.setName(updatedProduct.getName());
            product.setCount(updatedProduct.getCount());
            product.setPrice(updatedProduct.getPrice());
            product.setType(updatedProduct.getType());
            product.setDescription(updatedProduct.getDescription());
            product.setUpdatedAt(new Date());
            return Response.ok().build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @DELETE
    @Path("{id}")
    public Response deleteProduct(@PathParam("id") String id) {
        Product product = getProductById(id);
        if (product != null) {
            products.remove(product);
            return Response.ok().build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    private Product getProductById(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }
}