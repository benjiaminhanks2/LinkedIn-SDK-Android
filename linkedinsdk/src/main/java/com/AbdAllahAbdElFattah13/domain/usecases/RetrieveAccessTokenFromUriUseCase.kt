package com.AbdAllahAbdElFattah13.domain.usecases

import android.net.Uri
import com.AbdAllahAbdElFattah13.domain.utils.Executors
import com.AbdAllahAbdElFattah13.domain.utils.LinkedInConst

class RetrieveAccessTokenFromUriUseCase(executors: Executors) : UseCase<Uri, String?>(executors) {
    override fun run(input: Uri?): String? {
        return input?.getQueryParameter(LinkedInConst.RESPONSE_TYPE_VALUE)
    }
}