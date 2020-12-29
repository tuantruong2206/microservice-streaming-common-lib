package vn.microservice.streaming.common.lib.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import vn.microservice.streaming.common.lib.enumeration.Status;
import java.util.Date;

@Data
@AllArgsConstructor
public class OrderVerified {
    public OrderVerified() {}
    private String username;
    private Status status;
    private Long count;
    private String serviceName;
    private Date start;
    private Date end;
}

