//package com.example.FD.Aggregator.dto;
//
//import lombok.Data;
//
//@Data
//public class UserDetailsResponseDTO {
//    private SuccessData success;
//    private Object error;
//
//    @Data
//    public static class SuccessData {
//        private String successCode;
//        private String successMsg;
//        private DataDTO data;
//
//        public SuccessData(String successCode, String successMsg, DataDTO data) {
//            this.successCode = successCode;
//            this.successMsg = successMsg;
//            this.data = data;
//        }
//    }
//
//    @Data
//    public static class DataDTO {
//        private String refId;
//        private String email;
//        private String firstName;
//        private String lastName;
//        private String mobile;
//
//        public DataDTO(String refId, String email, String firstName, String lastName, String mobile) {
//            this.refId = refId;
//            this.email = email;
//            this.firstName = firstName;
//            this.lastName = lastName;
//            this.mobile = mobile;
//        }
//    }
//
//    public UserDetailsResponseDTO(SuccessData success, Object error) {
//        this.success = success;
//        this.error = error;
//    }
//
//}


package com.example.FD.Aggregator.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class UserDetailsResponseDTO {
    private SuccessData success;
    private Object error;

    @Data
    public static class SuccessData {
        private String successCode;
        private String successMsg;
        private DataDTO data;

        public SuccessData(String successCode, String successMsg, DataDTO data) {
            this.successCode = successCode;
            this.successMsg = successMsg;
            this.data = data;
        }
    }

    @Data
    public static class DataDTO {
        private String refId;
        private String email;
        private String firstName;
        private String lastName;
        private String mobile;
        private LocalDateTime createdDate;
        private LocalDateTime updatedDate;

        public DataDTO(String refId, String email, String firstName, String lastName, String mobile, LocalDateTime createdDate, LocalDateTime updatedDate) {
            this.refId = refId;
            this.email = email;
            this.firstName = firstName;
            this.lastName = lastName;
            this.mobile = mobile;
            this.createdDate = createdDate;
            this.updatedDate = updatedDate;
        }
    }

    public UserDetailsResponseDTO(SuccessData success, Object error) {
        this.success = success;
        this.error = error;
    }
}

