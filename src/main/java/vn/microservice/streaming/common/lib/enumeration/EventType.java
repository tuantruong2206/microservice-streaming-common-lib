package vn.microservice.streaming.common.lib.enumeration;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public enum EventType {

    AUDIT, LOG
}
