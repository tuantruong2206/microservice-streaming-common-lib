package vn.microservice.streaming.common.lib.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import vn.microservice.streaming.common.lib.enumeration.Status;

import java.time.Instant;
import java.util.Date;

@Data
@ToString
@Builder
@AllArgsConstructor
public class VerifiedOrderStreamDTO {
    public VerifiedOrderStreamDTO() {}
    private String userId;
    private String prodId;
    private Long orderId;
    private Status status;
    private String serviceName;
    private Instant start;
    private Instant end;
}

