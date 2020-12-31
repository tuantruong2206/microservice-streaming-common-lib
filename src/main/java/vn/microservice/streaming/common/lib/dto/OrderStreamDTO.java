package vn.microservice.streaming.common.lib.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import vn.microservice.streaming.common.lib.enumeration.Status;

import java.time.Instant;

/**
 * @author Tuan.Truong [Brian]
 * @version 1.0
 * @date 12/30/2020 11:22 AM
 * this class is the DTO of service to service communication
 */
@Data
@ToString
@Builder
@AllArgsConstructor
public class OrderStreamDTO {
    public OrderStreamDTO() {}
    private String userid;
    private Long orderId;
    private String ticker;
    private Long quality;
    private Double amount;
    private Status status;
    private Instant createdAt;
    private Instant updatedAt;
}
