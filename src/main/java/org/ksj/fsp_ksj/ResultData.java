package org.ksj.fsp_ksj;

public class ResultData {

    private String resultCode;
    private String msg;
    private Object data1; // 추가 데이터
    private Object data2; // 추가 데이터 (필요에 따라)

    // 기본 생성자
    public ResultData() {}

    // 생성자
    public ResultData(String resultCode, String msg, Object data1) {
        this.resultCode = resultCode;
        this.msg = msg;
        this.data1 = data1;
    }

    // 정적 메서드: 성공 결과 생성
    public static ResultData newData(String resultCode, String msg, Object data1) {
        return new ResultData(resultCode, msg, data1);
    }

    // 정적 메서드: 실패 결과 생성
    public static ResultData newFail(String resultCode, String msg) {
        return new ResultData(resultCode, msg, null);
    }

    // Getter 및 Setter
    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData1() {
        return data1;
    }

    public void setData1(Object data1) {
        this.data1 = data1;
    }

    public Object getData2() {
        return data2;
    }

    public void setData2(Object data2) {
        this.data2 = data2;
    }

    // 결과가 성공인지 확인하는 메서드
    public boolean isSuccess() {
        return "S-1".equals(resultCode);
    }

    // 결과가 실패인지 확인하는 메서드
    public boolean isFail() {
        return !isSuccess();
    }
}