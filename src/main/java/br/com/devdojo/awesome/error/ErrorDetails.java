package br.com.devdojo.awesome.error;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorDetails {
    private String title;
    private Integer status;
    private String detail;
    private Long timestamp;
    private String developMessage;

    public static final class Builder {
        private String title;
        private Integer status;
        private String detail;
        private Long timestamp;
        private String developMessage;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder developMessage(String developMessage) {
            this.developMessage = developMessage;
            return this;
        }

        public Builder but() {
            return newBuilder().title(title).status(status).detail(detail).timestamp(timestamp).developMessage(developMessage);
        }

        public ErrorDetails build() {
            ErrorDetails errorDetails = new ErrorDetails();
            errorDetails.setTitle(title);
            errorDetails.setStatus(status);
            errorDetails.setDetail(detail);
            errorDetails.setTimestamp(timestamp);
            errorDetails.setDevelopMessage(developMessage);
            return errorDetails;
        }
    }
}
