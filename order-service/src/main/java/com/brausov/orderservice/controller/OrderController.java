package com.brausov.orderservice.controller;

import com.brausov.orderservice.dto.OrderRequest;
import com.brausov.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeHolder(@RequestBody OrderRequest orderRequest) {
        orderService.placeOrder(orderRequest);
        return "Order placed Successfully";
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String greeting() {
        return String.valueOf("it's a order service");
    }

}
