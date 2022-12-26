package com.bluuminn.core;

import com.bluuminn.core.member.Grade;
import com.bluuminn.core.member.Member;
import com.bluuminn.core.member.MemberService;
import com.bluuminn.core.member.MemberServiceImpl;
import com.bluuminn.core.order.Order;
import com.bluuminn.core.order.OrderService;
import com.bluuminn.core.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("order = " + order);
        System.out.println("order.calculatePrice() = " + order.calculatePrice());
    }
}
