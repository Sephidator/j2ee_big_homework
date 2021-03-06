package nju.sephidator.yummybackend.service;

import nju.sephidator.yummybackend.vo.order.OrderDetailVO;
import nju.sephidator.yummybackend.vo.order.OrderInfoVO;
import nju.sephidator.yummybackend.vo.order.OrderVO;

import java.util.List;

public interface OrderService {

    String submit(String restaurantId, String memberEmail, Double totalAmount, Double discount, List<OrderDetailVO> orderDetailVOList);

    List<OrderVO> findMemberOrders(String email, Integer orderStatus);

    List<OrderVO> findRestaurantOrders(String restaurantId, Integer orderStatus);

    OrderInfoVO getOrderInfo(String id);

    List<OrderVO> payOrder(String id);

    List<OrderVO> handleOrder(String id);

    List<OrderVO> finishOrder(String id);

    List<OrderVO> cancelOrder(String id);
}
