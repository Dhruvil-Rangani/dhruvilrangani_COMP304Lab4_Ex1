package com.example.dhruvilrangani_COMP304Lab4_Ex1

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class DataSyncWorker(context: Context, workerParams: WorkerParameters) : Worker(context, workerParams) {

    override fun doWork(): Result {
        Log.d("DataSyncWorker", "Performing background data sync")
        // Simulate background data synchronization
        try {
            Thread.sleep(3000) // Simulate time-consuming operation
        } catch (e: InterruptedException) {
            e.printStackTrace()
            return Result.failure()
        }

        return Result.success()
    }
}