package toy.hong.openapi.app.service.validation;

import toy.hong.openapi.model.ApiUseApply;
import toy.hong.openapi.model.ApiUseHistory;

public class ApiUserValidationService extends ValidationService {

    /*
    * REGEX_APPLY_PROJECT_NAME : 한글/영문, 1글자 이상
    * REGEX_APPLY_USE_IP : 영문/특수문자(.), 7글자 이상
    * */
    private final String REGEX_APPLY_PROJECT_NAME = "^[a-zA-Z가-힣]{1,}$";
    private final String REGEX_APPLY_USE_IP = "^[a-zA-Z.]{7,}$";

    public void validateApplyAPIUser(ApiUseApply apiUseApply){
        validate("Project Name", apiUseApply.getProjectName(), REGEX_APPLY_PROJECT_NAME);
        validate("IP", apiUseApply.getIp(), REGEX_APPLY_USE_IP);
    }

    public void validateGetAPIUseApplyList(ApiUseApply apiUseApply){
        validate("PageNo", apiUseApply.getPageNo(), apiUseApply.getPageNo()<1);
        validate("PageSize", apiUseApply.getPageSize(), apiUseApply.getPageSize()<1);
    }

    public void validateApproveAPIUserApply(ApiUseApply apiUseApply){
        validate("Id", apiUseApply.getId());
    }

    public void validateGetAPIUseHistory(ApiUseHistory apiUseHistory){
        validate("PageNo", apiUseHistory.getPageNo(), apiUseHistory.getPageNo()<1);
        validate("PageSize", apiUseHistory.getPageSize(), apiUseHistory.getPageSize()<1);
    }

}
