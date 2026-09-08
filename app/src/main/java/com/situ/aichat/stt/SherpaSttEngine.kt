package com.situ.aichat.stt

import javax.inject.Inject
import javax.inject.Singleton

/**
 * STT compatibility stub.
 *
 * The fork intentionally ships without the on-device Sherpa STT model. Keeping this implementation
 * preserves the existing SttEngine API and lets the rest of the app degrade gracefully when voice
 * recognition is unavailable, while removing the ~77 MB bundled STT model from the APK.
 */
@Singleton
class SherpaSttEngine @Inject constructor() : SttEngine {
    override val isAvailable: Boolean = false

    override suspend fun transcribe(samples: FloatArray): String? = null

    override fun openStream(): SttStream? = null
}
