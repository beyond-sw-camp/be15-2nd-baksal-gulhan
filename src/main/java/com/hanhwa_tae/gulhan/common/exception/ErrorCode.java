package com.hanhwa_tae.gulhan.common.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public enum ErrorCode {
    // 회원
    INVALID_LOGIN_REQUEST("10001", "아이디 또는 비밀번호가 잘못되었습니다.", HttpStatus.UNAUTHORIZED),  // 401
    REFRESH_TOKEN_EXPIRATION("10002", "로그인이 만료되었습니다.", HttpStatus.NOT_FOUND),  // 404
    ACCESS_DENIED("10003", "해당 페이지에 대한 조회 권한이 없습니다.", HttpStatus.FORBIDDEN),    // 403
    DUPLICATE_EMAIL_EXISTS("10004", "중복 이메일이 존재합니다.", HttpStatus.BAD_REQUEST),
    DUPLICATE_ID_EXISTS("10005", "중복 아이디가 존재합니다.", HttpStatus.BAD_REQUEST),
    USER_NOT_FOUND("10006", "해당 유저를 찾을 수 없습니다.", HttpStatus.BAD_REQUEST),

    // 카카오 인증
    KAKAO_AUTH_FAILED("20001", "카카오 인증에 실패했습니다.", HttpStatus.UNAUTHORIZED),
    KAKAO_TOKEN_INVALID("20002", "카카오 토큰이 유효하지 않습니다.", HttpStatus.UNAUTHORIZED),
    KAKAO_TOKEN_EXPIRED("20003", "카카오 토큰이 만료되었습니다.", HttpStatus.UNAUTHORIZED),

    // 카카오 인증
    KAKAO_AUTH_FAILED("20001", "카카오 인증에 실패했습니다.", HttpStatus.UNAUTHORIZED),
    KAKAO_TOKEN_INVALID("20002", "카카오 토큰이 유효하지 않습니다.", HttpStatus.UNAUTHORIZED),
    KAKAO_TOKEN_EXPIRED("20003", "카카오 토큰이 만료되었습니다.", HttpStatus.UNAUTHORIZED),


    // JWT
    ACCESS_TOKEN_EXPIRED("11001", "Access Token이 만료되었습니다.", HttpStatus.UNAUTHORIZED),   // 401
    REFRESH_TOKEN_EXPIRED("11002", "Refresh Token이 만료되었습니다.", HttpStatus.UNAUTHORIZED), // 401
    INVALID_TOKEN("11003", "토큰이 유효하지 않습니다.", HttpStatus.BAD_REQUEST), // 400
    // TODO 나머지 이어서 적어주세요!



    // 그 외 기타 오류
    VALIDATION_ERROR("50000", "입력 값 검증 오류입니다.", HttpStatus.BAD_REQUEST),
    INTERNAL_SERVER_ERROR("50001", "내부 서버 오류 입니다.", HttpStatus.INTERNAL_SERVER_ERROR),
    UNAUTHORIZED_REQUEST("50002", "유효하지 않은 요청입니다.", HttpStatus.UNAUTHORIZED);

    private final String code;
    private final String message;
    private final HttpStatus httpStatus;
}
