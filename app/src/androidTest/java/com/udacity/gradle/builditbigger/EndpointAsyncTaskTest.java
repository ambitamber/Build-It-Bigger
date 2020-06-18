package com.udacity.gradle.builditbigger;

import android.content.Context;

import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@RunWith(AndroidJUnit4.class)
public class EndpointAsyncTaskTest {
    Context context;

    @Test
    public void jokeLoadedTest() throws InterruptedException, ExecutionException, TimeoutException {
        final CountDownLatch latch = new CountDownLatch(1);
        context = InstrumentationRegistry.getContext();

        EndpointAsyncTask endpointAsyncTask = new EndpointAsyncTask();
        endpointAsyncTask.execute(context);
        String joke = endpointAsyncTask.get(5, TimeUnit.SECONDS);
        Assert.assertEquals(45,joke.length());
    }

}