@isTest
private class OASEngineStateTest {
    @isTest
    private static void equalsSameInstance() {
        OASEngineState engineState1 = OASEngineState.getExample();
        OASEngineState engineState2 = engineState1;
        OASEngineState engineState3 = new OASEngineState();
        OASEngineState engineState4 = engineState3;

        System.assert(engineState1.equals(engineState2));
        System.assert(engineState2.equals(engineState1));
        System.assert(engineState1.equals(engineState1));
        System.assert(engineState3.equals(engineState4));
        System.assert(engineState4.equals(engineState3));
        System.assert(engineState3.equals(engineState3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEngineState engineState1 = OASEngineState.getExample();
        OASEngineState engineState2 = OASEngineState.getExample();
        OASEngineState engineState3 = new OASEngineState();
        OASEngineState engineState4 = new OASEngineState();

        System.assert(engineState1.equals(engineState2));
        System.assert(engineState2.equals(engineState1));
        System.assert(engineState3.equals(engineState4));
        System.assert(engineState4.equals(engineState3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEngineState engineState1 = OASEngineState.getExample();
        OASEngineState engineState2 = new OASEngineState();

        System.assertEquals(false, engineState1.equals('foo'));
        System.assertEquals(false, engineState2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEngineState engineState1 = OASEngineState.getExample();
        OASEngineState engineState2 = new OASEngineState();
        OASEngineState engineState3;

        System.assertEquals(false, engineState1.equals(engineState3));
        System.assertEquals(false, engineState2.equals(engineState3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEngineState engineState1 = OASEngineState.getExample();
        OASEngineState engineState2 = new OASEngineState();

        System.assertEquals(engineState1.hashCode(), engineState1.hashCode());
        System.assertEquals(engineState2.hashCode(), engineState2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEngineState engineState1 = OASEngineState.getExample();
        OASEngineState engineState2 = OASEngineState.getExample();
        OASEngineState engineState3 = new OASEngineState();
        OASEngineState engineState4 = new OASEngineState();

        System.assert(engineState1.equals(engineState2));
        System.assert(engineState3.equals(engineState4));
        System.assertEquals(engineState1.hashCode(), engineState2.hashCode());
        System.assertEquals(engineState3.hashCode(), engineState4.hashCode());
    }
}
