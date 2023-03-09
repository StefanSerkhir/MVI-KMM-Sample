package ru.kts.mobile.sample.data

import ru.kts.mobile.sample.common.Response
import ru.kts.mobile.sample.domain.api.model.UserInfo

internal interface Repository {

    suspend fun getUserInfo(): Response<UserInfo>
}

