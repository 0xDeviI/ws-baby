package org.ws.iranskill_prov_1400.data.api;

import org.ws.iranskill_prov_1400.data.api.request.AddNewCenterRequest;
import org.ws.iranskill_prov_1400.data.api.request.UpdateProfileRequest;
import org.ws.iranskill_prov_1400.data.api.response.CheckManagerPhoneResponse;
import org.ws.iranskill_prov_1400.data.api.response.LoginResponse;
import org.ws.iranskill_prov_1400.data.api.response.UserInfoResponse;
import org.ws.iranskill_prov_1400.data.models.AddCenter;
import org.ws.iranskill_prov_1400.data.models.Center;
import org.ws.iranskill_prov_1400.data.models.CenterType;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Api {
    String BASE_URL = "http://api.alihejazi.me/";

    @GET("User/SendCode/")
    Call<String> sendOtpRequest(@Query("phone") String phone);


    @GET("User/Login/")
    Call<LoginResponse> verifyOtpRequest(@Query("phone") String phone, @Query("code") String code);
    
    @GET("User/GetUserData/")
    Call<UserInfoResponse> getUserInfoRequest(@Header("Authorization") String authHeader);

    @POST("User/updateProfile/")
    Call<String> sendProfileUpdateRequest(@Header("Authorization") String authHeader,
                                          @Body UpdateProfileRequest updateProfileRequest);

    @GET("Center/GetList/")
    Call<List<Center>> sendFetchAllCentersRequest(@Header("Authorization") String authHeader);

    @GET("Center/GetCenter/")
    Call<Center> sendFetchCenterRequest(@Header("Authorization") String authHeader, @Query("id") int centerId);

    @GET("AddCenter/CheckManagerPhone/")
    Call<CheckManagerPhoneResponse> sendCheckManagerPhoneRequest(@Header("Authorization") String authHeader,
                                                                 @Query("phone") String managerPhone);

    @GET("Center/GetCenterTypes/")
    Call<List<CenterType>> sendGetCenterTypesRequest(@Header("Authorization") String authHeader);

    @POST("AddCenter/Save/")
    Call<Center> sendSaveCenterRequest(@Header("Authorization") String authHeader, @Body AddCenter center);
}
