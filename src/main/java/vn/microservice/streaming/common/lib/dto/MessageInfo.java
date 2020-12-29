package vn.microservice.streaming.common.lib.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.microservice.streaming.common.lib.enumeration.MessageCodeEnum;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageInfo {

    private String code;
    private String message;

    public MessageInfo(MessageCodeEnum messageCodeEnum) {
        this.code = messageCodeEnum.getCode();
        this.message = messageCodeEnum.getMsg();
    }
}
