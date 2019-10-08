package br.com.devdojo.awesome.error;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValidationErrorDetails extends ErrorDetails {

    private String field;
    private String fieldMessage;


    public static final class Builder {
        private String title;
        private Integer status;
        private String detail;
        private String field;
        private Long timestamp;
        private String fieldMessage;
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

        public Builder field(String field) {
            this.field = field;
            return this;
        }

        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder fieldMessage(String fieldMessage) {
            this.fieldMessage = fieldMessage;
            return this;
        }

        public Builder developMessage(String developMessage) {
            this.developMessage = developMessage;
            return this;
        }

        public Builder but() {
            return newBuilder().title(title).status(status).detail(detail).field(field).timestamp(timestamp).fieldMessage(fieldMessage).developMessage(developMessage);
        }

        public ValidationErrorDetails build() {
            ValidationErrorDetails validationErrorDetails = new ValidationErrorDetails();
            validationErrorDetails.setTitle(title);
            validationErrorDetails.setStatus(status);
            validationErrorDetails.setDetail(detail);
            validationErrorDetails.setField(field);
            validationErrorDetails.setTimestamp(timestamp);
            validationErrorDetails.setFieldMessage(fieldMessage);
            validationErrorDetails.setDevelopMessage(developMessage);
            return validationErrorDetails;
        }
    }
}