package com.soopeach.data.api

import com.soopeach.domain.model.request.FcmRequest
import com.soopeach.domain.model.response.FcmResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface FcmAPI {

    @POST("postToken")
    suspend fun postToken(
        @Body fcmRequest: FcmRequest
    ) : FcmResponse

}