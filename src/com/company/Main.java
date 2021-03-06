package com.company;

import com.company.Atomic.BusinessLogic;
import com.company.Atomic.Metrics;
import com.company.Atomic.MetricsPrinter;
import com.company.DeadLock.Intersection;
import com.company.DeadLock.TrainA;
import com.company.DeadLock.TrainB;
import com.company.ECommerce.SharingResource;
import com.company.ObjectVariables.MatricesGenerator;
import com.company.ReentrantLock.RMain;
import com.company.Semaphore.Barrier;
import com.company.Semaphore.CoordinatedWorkRunner;
import com.company.SharedC.SharedClass;
import com.company.WordCount.ThroughputHttpServer;
import com.company.images.PixelColor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {

        SharingResource.init();
    }
}
